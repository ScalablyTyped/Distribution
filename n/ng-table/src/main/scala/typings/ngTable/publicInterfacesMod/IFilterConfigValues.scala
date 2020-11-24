package typings.ngTable.publicInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterConfigValues extends js.Object {
  
  /**
    * A map of alias names and their corrosponding urls. A lookup against this map will be used
    * to find the url matching an alias name.
    * If no match is found then a url will be derived using the following pattern `${defaultBaseUrl}${aliasName}.${defaultExt}`
    */
  var aliasUrls: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The default base url to use when deriving the url for a filter template given just an alias name
    * Defaults to 'ng-table/filters/'
    */
  var defaultBaseUrl: js.UndefOr[String] = js.native
  
  /**
    * The extension to use when deriving the url of a filter template when given just an alias name
    */
  var defaultExt: js.UndefOr[String] = js.native
}
object IFilterConfigValues {
  
  @scala.inline
  def apply(): IFilterConfigValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterConfigValues]
  }
  
  @scala.inline
  implicit class IFilterConfigValuesOps[Self <: IFilterConfigValues] (val x: Self) extends AnyVal {
    
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
    def setAliasUrls(value: StringDictionary[String]): Self = this.set("aliasUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasUrls: Self = this.set("aliasUrls", js.undefined)
    
    @scala.inline
    def setDefaultBaseUrl(value: String): Self = this.set("defaultBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBaseUrl: Self = this.set("defaultBaseUrl", js.undefined)
    
    @scala.inline
    def setDefaultExt(value: String): Self = this.set("defaultExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExt: Self = this.set("defaultExt", js.undefined)
  }
}
