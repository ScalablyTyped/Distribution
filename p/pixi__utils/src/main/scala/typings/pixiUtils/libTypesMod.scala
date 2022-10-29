package typings.pixiUtils

import org.scalablytyped.runtime.StringDictionary
import typings.pixiUtils.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type ArrayFixed[T, L /* <: Double */] = Array[T] & Length[L]
  
  type Dict[T] = StringDictionary[T]
}
