package typings.playable

import typings.playable.anon.Scoped
import typings.playable.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/core/dependency-container/registrations", JSImport.Namespace)
@js.native
object registrationsMod extends js.Object {
  
  val PROPERTY_FOR_DEPENDENCIES: /* "dependencies" */ String = js.native
  
  val asClass: js.Any = js.native
  
  val asFunction: js.Any = js.native
  
  def asValue(value: js.Any): js.Any = js.native
  
  def makeFluidInterface(obj: IOptions): Scoped = js.native
  
  @js.native
  object default extends js.Object {
    
    var asClass: js.Any = js.native
    
    var asFunction: js.Any = js.native
    
    def asValue(value: js.Any): js.Any = js.native
  }
}
