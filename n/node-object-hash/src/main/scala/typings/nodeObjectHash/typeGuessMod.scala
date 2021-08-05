package typings.nodeObjectHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeGuessMod {
  
  @JSImport("node-object-hash/dist/typeGuess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def guessObjectType(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guessObjectType")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def guessType(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guessType")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
