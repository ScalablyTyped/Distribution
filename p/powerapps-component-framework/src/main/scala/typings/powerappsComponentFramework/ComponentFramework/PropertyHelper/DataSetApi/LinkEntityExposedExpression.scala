package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity linking expression
  */
@js.native
trait LinkEntityExposedExpression extends js.Object {
  
  /**
    * The 'alias' for the link-entity relationship
    */
  var alias: String = js.native
  
  /**
    * The 'from' attribute in the link-entity relationship
    */
  var from: String = js.native
  
  /**
    * The 'type' of the link, referred by the link-entity attribute
    */
  var linkType: String = js.native
  
  /**
    * The 'name' of the entity to link to
    */
  var name: String = js.native
  
  /**
    * The 'to' attribute in the link-entity relationship
    */
  var to: String = js.native
}
object LinkEntityExposedExpression {
  
  @scala.inline
  def apply(alias: String, from: String, linkType: String, name: String, to: String): LinkEntityExposedExpression = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkEntityExposedExpression]
  }
  
  @scala.inline
  implicit class LinkEntityExposedExpressionOps[Self <: LinkEntityExposedExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: String): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
