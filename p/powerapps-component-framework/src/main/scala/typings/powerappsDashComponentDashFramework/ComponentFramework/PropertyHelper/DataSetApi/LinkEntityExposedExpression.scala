package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Entity linking expression
			 */
trait LinkEntityExposedExpression extends js.Object {
  /**
  				 * The 'alias' for the link-entity relationship
  				 */
  var alias: String
  /**
  				 * The 'from' attribute in the link-entity relationship
  				 */
  var from: String
  /**
  				 * The 'type' of the link, referred by the link-entity attribute
  				 */
  var linkType: String
  /**
  				 * The 'name' of the entity to link to
  				 */
  var name: String
  /**
  				 * The 'to' attribute in the link-entity relationship
  				 */
  var to: String
}

object LinkEntityExposedExpression {
  @scala.inline
  def apply(alias: String, from: String, linkType: String, name: String, to: String): LinkEntityExposedExpression = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LinkEntityExposedExpression]
  }
}

