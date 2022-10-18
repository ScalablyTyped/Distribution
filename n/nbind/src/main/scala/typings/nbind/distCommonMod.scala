package typings.nbind

import typings.nbind.nbindInts.`0`
import typings.nbind.nbindInts.`1`
import typings.nbind.nbindInts.`2`
import typings.nbind.nbindInts.`3`
import typings.nbind.nbindInts.`4`
import typings.nbind.nbindInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonMod {
  
  @JSImport("nbind/dist/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeAccessorPrefix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccessorPrefix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nbind.nbindInts.`0`
    - typings.nbind.nbindInts.`1`
    - typings.nbind.nbindInts.`2`
    - typings.nbind.nbindInts.`3`
    - typings.nbind.nbindInts.`4`
    - typings.nbind.nbindInts.`5`
  */
  trait SignatureType extends StObject
  object SignatureType {
    
    inline def construct: `5` = 5.asInstanceOf[`5`]
    
    inline def func: `1` = 1.asInstanceOf[`1`]
    
    inline def getter: `3` = 3.asInstanceOf[`3`]
    
    inline def method: `2` = 2.asInstanceOf[`2`]
    
    inline def none: `0` = 0.asInstanceOf[`0`]
    
    inline def setter: `4` = 4.asInstanceOf[`4`]
  }
}
