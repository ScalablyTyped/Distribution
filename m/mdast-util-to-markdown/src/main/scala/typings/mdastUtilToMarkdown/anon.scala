package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.trackMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Current extends StObject {
    
    def current(): LineShift = js.native
    
    def move(): String = js.native
    def move(value: String): String = js.native
    
    def shift(value: Double): Unit = js.native
  }
  
  trait LineShift extends StObject {
    
    var lineShift: Double
    
    var now: Point
  }
  object LineShift {
    
    inline def apply(lineShift: Double, now: Point): LineShift = {
      val __obj = js.Dynamic.literal(lineShift = lineShift.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineShift]
    }
    
    extension [Self <: LineShift](x: Self) {
      
      inline def setLineShift(value: Double): Self = StObject.set(x, "lineShift", value.asInstanceOf[js.Any])
      
      inline def setNow(value: Point): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/util/safe.SafeOptions & {  encode :std.Array<string> | undefined} */
  trait SafeOptionsencodeArraystr extends StObject {
    
    var after: String
    
    var before: String
    
    var encode: js.UndefOr[js.Array[String]] = js.undefined
    
    var lineShift: Double
    
    var now: typings.mdastUtilToMarkdown.typesMod.Point
  }
  object SafeOptionsencodeArraystr {
    
    inline def apply(after: String, before: String, lineShift: Double, now: typings.mdastUtilToMarkdown.typesMod.Point): SafeOptionsencodeArraystr = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], lineShift = lineShift.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeOptionsencodeArraystr]
    }
    
    extension [Self <: SafeOptionsencodeArraystr](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: js.Array[String]): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setEncodeVarargs(value: String*): Self = StObject.set(x, "encode", js.Array(value*))
      
      inline def setLineShift(value: Double): Self = StObject.set(x, "lineShift", value.asInstanceOf[js.Any])
      
      inline def setNow(value: typings.mdastUtilToMarkdown.typesMod.Point): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    }
  }
}
