package typings.nzh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nzh", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Nzh {
    def this(lang: Lang) = this()
  }
  /* static members */
  object default {
    
    @JSImport("nzh", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nzh", "default.cn")
    @js.native
    def cn: BuiltIn = js.native
    inline def cn_=(x: BuiltIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cn")(x.asInstanceOf[js.Any])
    
    @JSImport("nzh", "default.hk")
    @js.native
    def hk: BuiltIn = js.native
    inline def hk_=(x: BuiltIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hk")(x.asInstanceOf[js.Any])
    
    @JSImport("nzh", "default.langs")
    @js.native
    def langs: Langs = js.native
    inline def langs_=(x: Langs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("langs")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Nzh extends StObject {
    
    def decode(zhnum: String): String = js.native
    def decode(zhnum: String, options: Options): String = js.native
    
    def encode(num: String): String = js.native
    def encode(num: String, options: Options): String = js.native
    def encode(num: Double): String = js.native
    def encode(num: Double, options: Options): String = js.native
    
    def toMoney(num: String): String = js.native
    def toMoney(num: String, options: ToMoneyOptions): String = js.native
    def toMoney(num: Double): String = js.native
    def toMoney(num: Double, options: ToMoneyOptions): String = js.native
  }
}
