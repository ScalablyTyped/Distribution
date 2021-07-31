package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for nw.Window.get().capturePage().
  */
trait CapturePageConfig extends StObject {
  
  /**
    *  (Optional) It supports three types: "raw", "buffer" and "datauri". If ignored, it’s "datauri" by default.
    */
  var datatype: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) The image format used to generate the image. It supports two formats: "png" and "jpeg". If ignored, it’s "jpeg" by default.
    */
  var format: js.UndefOr[String] = js.undefined
}
object CapturePageConfig {
  
  @scala.inline
  def apply(): CapturePageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapturePageConfig]
  }
  
  @scala.inline
  implicit class CapturePageConfigMutableBuilder[Self <: CapturePageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
