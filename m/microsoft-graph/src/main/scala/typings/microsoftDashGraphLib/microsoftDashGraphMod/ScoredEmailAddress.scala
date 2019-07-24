package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoredEmailAddress extends js.Object {
  var ItemId: js.UndefOr[java.lang.String] = js.undefined
  // The email address.
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned
    * results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s
    * communication and collaboration patterns and business relationships.
    */
  var relevanceScore: js.UndefOr[scala.Double] = js.undefined
  var selectionLikelihood: js.UndefOr[SelectionLikelihoodInfo] = js.undefined
}

object ScoredEmailAddress {
  @scala.inline
  def apply(
    ItemId: java.lang.String = null,
    address: java.lang.String = null,
    relevanceScore: scala.Int | scala.Double = null,
    selectionLikelihood: SelectionLikelihoodInfo = null
  ): ScoredEmailAddress = {
    val __obj = js.Dynamic.literal()
    if (ItemId != null) __obj.updateDynamic("ItemId")(ItemId)
    if (address != null) __obj.updateDynamic("address")(address)
    if (relevanceScore != null) __obj.updateDynamic("relevanceScore")(relevanceScore.asInstanceOf[js.Any])
    if (selectionLikelihood != null) __obj.updateDynamic("selectionLikelihood")(selectionLikelihood)
    __obj.asInstanceOf[ScoredEmailAddress]
  }
}

