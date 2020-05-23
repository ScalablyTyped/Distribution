package typings.officeUiFabricReact.documentCardTitleBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardTitleState extends js.Object {
  var clientWidth: js.UndefOr[Double] = js.undefined
  /**
    * In measuring, it will render a same style text with whiteSpace: 'nowrap', to get overflow rate.
    * So that the logic can predict truncated text well.
    */
  var needMeasurement: Boolean
  var previousTitle: String
  var truncatedTitleFirstPiece: js.UndefOr[String] = js.undefined
  var truncatedTitleSecondPiece: js.UndefOr[String] = js.undefined
}

object IDocumentCardTitleState {
  @scala.inline
  def apply(
    needMeasurement: Boolean,
    previousTitle: String,
    clientWidth: js.UndefOr[Double] = js.undefined,
    truncatedTitleFirstPiece: String = null,
    truncatedTitleSecondPiece: String = null
  ): IDocumentCardTitleState = {
    val __obj = js.Dynamic.literal(needMeasurement = needMeasurement.asInstanceOf[js.Any], previousTitle = previousTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(clientWidth)) __obj.updateDynamic("clientWidth")(clientWidth.get.asInstanceOf[js.Any])
    if (truncatedTitleFirstPiece != null) __obj.updateDynamic("truncatedTitleFirstPiece")(truncatedTitleFirstPiece.asInstanceOf[js.Any])
    if (truncatedTitleSecondPiece != null) __obj.updateDynamic("truncatedTitleSecondPiece")(truncatedTitleSecondPiece.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardTitleState]
  }
}

