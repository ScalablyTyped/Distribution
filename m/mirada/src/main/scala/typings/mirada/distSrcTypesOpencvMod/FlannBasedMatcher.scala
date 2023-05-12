package typings.mirada.distSrcTypesOpencvMod

import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv", "FlannBasedMatcher")
@js.native
open class FlannBasedMatcher ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.FlannBasedMatcher {
  def this(indexParams: Ptr) = this()
  def this(indexParams: Unit, searchParams: Ptr) = this()
  def this(indexParams: Ptr, searchParams: Ptr) = this()
}
/* static members */
object FlannBasedMatcher {
  
  @JSImport("mirada/dist/src/types/opencv", "FlannBasedMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Ptr]
}
