package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libI18nResourceStringMod {
  
  inline def apply(key: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/i18n/ResourceString", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ResourceString {
    def this(key: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/i18n/ResourceString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ResourceString extends StObject
}
