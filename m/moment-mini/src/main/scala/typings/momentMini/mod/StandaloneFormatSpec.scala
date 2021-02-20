package typings.momentMini.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandaloneFormatSpec extends StObject {
  
  var format: js.Array[String] = js.native
  
  var isFormat: js.UndefOr[RegExp] = js.native
  
  var standalone: js.Array[String] = js.native
}
object StandaloneFormatSpec {
  
  @scala.inline
  def apply(format: js.Array[String], standalone: js.Array[String]): StandaloneFormatSpec = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandaloneFormatSpec]
  }
  
  @scala.inline
  implicit class StandaloneFormatSpecMutableBuilder[Self <: StandaloneFormatSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
    
    @scala.inline
    def setIsFormat(value: RegExp): Self = StObject.set(x, "isFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFormatUndefined: Self = StObject.set(x, "isFormat", js.undefined)
    
    @scala.inline
    def setStandalone(value: js.Array[String]): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandaloneVarargs(value: String*): Self = StObject.set(x, "standalone", js.Array(value :_*))
  }
}
