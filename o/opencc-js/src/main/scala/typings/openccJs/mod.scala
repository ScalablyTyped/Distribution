package typings.openccJs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("opencc-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Converter(options: ConverterOptions): ConvertText = ^.asInstanceOf[js.Dynamic].applyDynamic("Converter")(options.asInstanceOf[js.Any]).asInstanceOf[ConvertText]
  
  inline def CustomConverter(dictionary: js.Array[js.Tuple2[String, String]]): ConvertText = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomConverter")(dictionary.asInstanceOf[js.Any]).asInstanceOf[ConvertText]
  
  inline def HTMLConverter(converter: ConvertText, rootNode: Element, langAttrInitial: String, langAttrNew: String): HTMLConvertHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("HTMLConverter")(converter.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], langAttrInitial.asInstanceOf[js.Any], langAttrNew.asInstanceOf[js.Any])).asInstanceOf[HTMLConvertHandler]
  
  type ConvertText = js.Function1[/* text */ String, String]
  
  trait ConverterOptions extends StObject {
    
    var from: js.UndefOr[Locale] = js.undefined
    
    var to: js.UndefOr[Locale] = js.undefined
  }
  object ConverterOptions {
    
    inline def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    extension [Self <: ConverterOptions](x: Self) {
      
      inline def setFrom(value: Locale): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Locale): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait HTMLConvertHandler extends StObject {
    
    def convert(): Unit
    
    def restore(): Unit
  }
  object HTMLConvertHandler {
    
    inline def apply(convert: () => Unit, restore: () => Unit): HTMLConvertHandler = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction0(convert), restore = js.Any.fromFunction0(restore))
      __obj.asInstanceOf[HTMLConvertHandler]
    }
    
    extension [Self <: HTMLConvertHandler](x: Self) {
      
      inline def setConvert(value: () => Unit): Self = StObject.set(x, "convert", js.Any.fromFunction0(value))
      
      inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openccJs.openccJsStrings.cn
    - typings.openccJs.openccJsStrings.tw
    - typings.openccJs.openccJsStrings.twp
    - typings.openccJs.openccJsStrings.hk
    - typings.openccJs.openccJsStrings.jp
    - typings.openccJs.openccJsStrings.t
  */
  trait Locale extends StObject
  object Locale {
    
    inline def cn: typings.openccJs.openccJsStrings.cn = "cn".asInstanceOf[typings.openccJs.openccJsStrings.cn]
    
    inline def hk: typings.openccJs.openccJsStrings.hk = "hk".asInstanceOf[typings.openccJs.openccJsStrings.hk]
    
    inline def jp: typings.openccJs.openccJsStrings.jp = "jp".asInstanceOf[typings.openccJs.openccJsStrings.jp]
    
    inline def t: typings.openccJs.openccJsStrings.t = "t".asInstanceOf[typings.openccJs.openccJsStrings.t]
    
    inline def tw: typings.openccJs.openccJsStrings.tw = "tw".asInstanceOf[typings.openccJs.openccJsStrings.tw]
    
    inline def twp: typings.openccJs.openccJsStrings.twp = "twp".asInstanceOf[typings.openccJs.openccJsStrings.twp]
  }
}
