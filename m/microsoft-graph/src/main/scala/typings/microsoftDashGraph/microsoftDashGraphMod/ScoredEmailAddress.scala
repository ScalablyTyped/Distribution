package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoredEmailAddress extends js.Object {
  // The email address.
  var address: js.UndefOr[String] = js.undefined
  var itemId: js.UndefOr[String] = js.undefined
  /**
    * The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned
    * results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s
    * communication and collaboration patterns and business relationships.
    */
  var relevanceScore: js.UndefOr[Double] = js.undefined
  var selectionLikelihood: js.UndefOr[SelectionLikelihoodInfo] = js.undefined
}

object ScoredEmailAddress {
  @scala.inline
  def apply(
    address: String = null,
    itemId: String = null,
    relevanceScore: Int | Double = null,
    selectionLikelihood: SelectionLikelihoodInfo = null
  ): ScoredEmailAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (relevanceScore != null) __obj.updateDynamic("relevanceScore")(relevanceScore.asInstanceOf[js.Any])
    if (selectionLikelihood != null) __obj.updateDynamic("selectionLikelihood")(selectionLikelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScoredEmailAddress]
  }
}

