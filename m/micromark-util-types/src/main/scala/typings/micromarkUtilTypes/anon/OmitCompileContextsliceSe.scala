package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.CompileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<micromark-util-types.micromark-util-types.CompileContext, 'sliceSerialize'> */
trait OmitCompileContextsliceSe extends StObject {
  
  def buffer(): Unit
  @JSName("buffer")
  var buffer_Original: js.Function0[Unit]
  
  def encode(value: String): String
  @JSName("encode")
  var encode_Original: js.Function1[/* value */ String, String]
  
  def getData[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData[K] */ js.Any
  @JSName("getData")
  var getData_Original: js.Function1[
    /* key */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData[string] */ js.Any
  ]
  
  def lineEndingIfNeeded(): Unit
  @JSName("lineEndingIfNeeded")
  var lineEndingIfNeeded_Original: js.Function0[Unit]
  
  var options: CompileOptions
  
  def raw(value: String): Unit
  @JSName("raw")
  var raw_Original: js.Function1[/* value */ String, Unit]
  
  def resume(): String
  @JSName("resume")
  var resume_Original: js.Function0[String]
  
  def setData(key: String): Unit
  def setData(key: String, value: Any): Unit
  @JSName("setData")
  var setData_Original: js.Function2[/* key */ String, /* value */ js.UndefOr[Any], Unit]
  
  def tag(value: String): Unit
  @JSName("tag")
  var tag_Original: js.Function1[/* value */ String, Unit]
}
object OmitCompileContextsliceSe {
  
  inline def apply(
    buffer: () => Unit,
    encode: /* value */ String => String,
    getData: /* key */ String => /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData[string] */ js.Any,
    lineEndingIfNeeded: () => Unit,
    options: CompileOptions,
    raw: /* value */ String => Unit,
    resume: () => String,
    setData: (/* key */ String, /* value */ js.UndefOr[Any]) => Unit,
    tag: /* value */ String => Unit
  ): OmitCompileContextsliceSe = {
    val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction0(buffer), encode = js.Any.fromFunction1(encode), getData = js.Any.fromFunction1(getData), lineEndingIfNeeded = js.Any.fromFunction0(lineEndingIfNeeded), options = options.asInstanceOf[js.Any], raw = js.Any.fromFunction1(raw), resume = js.Any.fromFunction0(resume), setData = js.Any.fromFunction2(setData), tag = js.Any.fromFunction1(tag))
    __obj.asInstanceOf[OmitCompileContextsliceSe]
  }
  
  extension [Self <: OmitCompileContextsliceSe](x: Self) {
    
    inline def setBuffer(value: () => Unit): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
    
    inline def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setGetData(
      value: /* key */ String => /* import warning: importer.ImportType#apply Failed type conversion: micromark-util-types.micromark-util-types.CompileData[string] */ js.Any
    ): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setLineEndingIfNeeded(value: () => Unit): Self = StObject.set(x, "lineEndingIfNeeded", js.Any.fromFunction0(value))
    
    inline def setOptions(value: CompileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: /* value */ String => Unit): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
    
    inline def setResume(value: () => String): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setSetData(value: (/* key */ String, /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
    
    inline def setTag(value: /* value */ String => Unit): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
  }
}
