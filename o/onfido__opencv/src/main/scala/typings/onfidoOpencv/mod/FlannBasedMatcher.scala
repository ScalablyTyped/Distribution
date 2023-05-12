package typings.onfidoOpencv.mod

import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@onfido/opencv", "FlannBasedMatcher")
@js.native
open class FlannBasedMatcher ()
  extends typings.mirada.mod.FlannBasedMatcher {
  def this(indexParams: Ptr) = this()
  def this(indexParams: Unit, searchParams: Ptr) = this()
  def this(indexParams: Ptr, searchParams: Ptr) = this()
}
/* static members */
object FlannBasedMatcher {
  
  @JSImport("@onfido/opencv", "FlannBasedMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Ptr]
}
