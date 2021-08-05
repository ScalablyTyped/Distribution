package typings.nodeRedEditorClient.anon

import typings.nodeRedUtil.mod.I18nTFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("_")
  def _underscore(id: String): String
  @JSName("_")
  def _underscore(id: String, tplStrs: Record[String, String | Double]): String
  @JSName("_")
  var _underscore_Original: I18nTFunction
}
object _empty {
  
  inline def apply(
    _underscore: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String
  ): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(js.Any.fromFunction2(_underscore))
    __obj.asInstanceOf[_empty]
  }
  
  extension [Self <: _empty](x: Self) {
    
    inline def set_underscore(value: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String): Self = StObject.set(x, "_", js.Any.fromFunction2(value))
  }
}
