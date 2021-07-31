package typings.microtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("microtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  @scala.inline
  def nowDouble(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nowDouble")().asInstanceOf[Double]
  
  @scala.inline
  def nowStruct(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nowStruct")().asInstanceOf[js.Array[Double]]
}
