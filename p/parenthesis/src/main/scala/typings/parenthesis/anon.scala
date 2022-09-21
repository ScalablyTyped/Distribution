package typings.parenthesis

import typings.parenthesis.parenthesisBooleans.`false`
import typings.parenthesis.parenthesisBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Flat extends StObject {
    
    var flat: Boolean
  }
  object Flat {
    
    inline def apply(flat: Boolean): Flat = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flat]
    }
    
    extension [Self <: Flat](x: Self) {
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parenthesis.parenthesis.Opts & {  flat :false | undefined} */
  trait Optsflatfalseundefined extends StObject {
    
    // Single brackets string or list of strings to detect brackets. Can be repeating brackets eg. "" or ''.
    var brackets: js.UndefOr[String | js.Array[String]] = js.undefined
    
    // Escape prefix for flat references.
    var escape: js.UndefOr[String] = js.undefined
    
    var flat: js.UndefOr[`false`] = js.undefined
  }
  object Optsflatfalseundefined {
    
    inline def apply(): Optsflatfalseundefined = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optsflatfalseundefined]
    }
    
    extension [Self <: Optsflatfalseundefined](x: Self) {
      
      inline def setBrackets(value: String | js.Array[String]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
      
      inline def setBracketsVarargs(value: String*): Self = StObject.set(x, "brackets", js.Array(value*))
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setFlat(value: `false`): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    }
  }
  
  /* Inlined parenthesis.parenthesis.Opts & {  flat :true} */
  trait Optsflattrue extends StObject {
    
    // Single brackets string or list of strings to detect brackets. Can be repeating brackets eg. "" or ''.
    var brackets: js.UndefOr[String | js.Array[String]] = js.undefined
    
    // Escape prefix for flat references.
    var escape: js.UndefOr[String] = js.undefined
    
    var flat: `true`
  }
  object Optsflattrue {
    
    inline def apply(): Optsflattrue = {
      val __obj = js.Dynamic.literal(flat = true)
      __obj.asInstanceOf[Optsflattrue]
    }
    
    extension [Self <: Optsflattrue](x: Self) {
      
      inline def setBrackets(value: String | js.Array[String]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
      
      inline def setBracketsVarargs(value: String*): Self = StObject.set(x, "brackets", js.Array(value*))
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setFlat(value: `true`): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    }
  }
}
