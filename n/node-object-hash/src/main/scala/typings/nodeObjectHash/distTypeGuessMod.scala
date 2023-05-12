package typings.nodeObjectHash

import typings.nodeObjectHash.mod.Hashable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypeGuessMod {
  
  @JSImport("node-object-hash/dist/typeGuess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def guessObjectType[T](obj: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guessObjectType")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def guessType[T](obj: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guessType")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def instanceOfHashable[T](`object`: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfHashable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def instanceOfHashable[T](`object`: Hashable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfHashable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
