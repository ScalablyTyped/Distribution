package typings.node.vmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions extends StObject {
  
  /**
    * Specifies the column number offset that is displayed in stack traces produced by this script.
    * @default 0
    */
  var columnOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the filename used in stack traces produced by this script.
    * Default: `''`.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the line number offset that is displayed in stack traces produced by this script.
    * Default: `0`.
    */
  var lineOffset: js.UndefOr[Double] = js.undefined
}
object BaseOptions {
  
  inline def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
    inline def setColumnOffset(value: Double): Self = StObject.set(x, "columnOffset", value.asInstanceOf[js.Any])
    
    inline def setColumnOffsetUndefined: Self = StObject.set(x, "columnOffset", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setLineOffset(value: Double): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
    
    inline def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
  }
}
