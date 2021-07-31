package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.json
import typings.mendixmodelsdk.mendixmodelsdkStrings.zip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetFilesOptions extends StObject {
  
  var filter: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[json | zip] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object IGetFilesOptions {
  
  @scala.inline
  def apply(): IGetFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetFilesOptions]
  }
  
  @scala.inline
  implicit class IGetFilesOptionsMutableBuilder[Self <: IGetFilesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFormat(value: json | zip): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
