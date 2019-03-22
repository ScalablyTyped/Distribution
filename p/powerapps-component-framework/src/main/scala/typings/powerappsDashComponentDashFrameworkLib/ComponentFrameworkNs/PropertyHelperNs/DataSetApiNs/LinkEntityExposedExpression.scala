package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

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
  var alias: java.lang.String
  /**
  				 * The 'from' attribute in the link-entity relationship
  				 */
  var from: java.lang.String
  /**
  				 * The 'type' of the link, referred by the link-entity attribute
  				 */
  var linkType: java.lang.String
  /**
  				 * The 'name' of the entity to link to
  				 */
  var name: java.lang.String
  /**
  				 * The 'to' attribute in the link-entity relationship
  				 */
  var to: java.lang.String
}

object LinkEntityExposedExpression {
  @scala.inline
  def apply(
    alias: java.lang.String,
    from: java.lang.String,
    linkType: java.lang.String,
    name: java.lang.String,
    to: java.lang.String
  ): LinkEntityExposedExpression = {
    val __obj = js.Dynamic.literal(alias = alias, from = from, linkType = linkType, name = name, to = to)
  
    __obj.asInstanceOf[LinkEntityExposedExpression]
  }
}

