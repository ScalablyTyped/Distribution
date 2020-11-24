package typings.powerappsComponentFramework.ComponentFramework.UtilityApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used when opening a lookup dialog.
  */
@js.native
trait LookupOptions extends js.Object {
  
  /**
    * Whether the lookup allows more than one item to be selected.
    */
  var allowMultiSelect: Boolean = js.native
  
  /**
    * The default entity type.
    */
  var defaultEntityType: String = js.native
  
  /**
    * The default view to use.
    */
  var defaultViewId: String = js.native
  
  /**
    * The entity types to display.
    */
  var entityTypes: js.Array[String] = js.native
  
  /**
    * The views to be available in the view picker. Only System views are supported (not user views).
    */
  var viewIds: js.Array[String] = js.native
}
object LookupOptions {
  
  @scala.inline
  def apply(
    allowMultiSelect: Boolean,
    defaultEntityType: String,
    defaultViewId: String,
    entityTypes: js.Array[String],
    viewIds: js.Array[String]
  ): LookupOptions = {
    val __obj = js.Dynamic.literal(allowMultiSelect = allowMultiSelect.asInstanceOf[js.Any], defaultEntityType = defaultEntityType.asInstanceOf[js.Any], defaultViewId = defaultViewId.asInstanceOf[js.Any], entityTypes = entityTypes.asInstanceOf[js.Any], viewIds = viewIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptions]
  }
  
  @scala.inline
  implicit class LookupOptionsOps[Self <: LookupOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowMultiSelect(value: Boolean): Self = this.set("allowMultiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEntityType(value: String): Self = this.set("defaultEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultViewId(value: String): Self = this.set("defaultViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: js.Array[String]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewIdsVarargs(value: String*): Self = this.set("viewIds", js.Array(value :_*))
    
    @scala.inline
    def setViewIds(value: js.Array[String]): Self = this.set("viewIds", value.asInstanceOf[js.Any])
  }
}
