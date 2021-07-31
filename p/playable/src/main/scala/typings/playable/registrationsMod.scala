package typings.playable

import typings.playable.anon.Scoped
import typings.playable.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrationsMod {
  
  @JSImport("playable/dist/src/core/dependency-container/registrations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("playable/dist/src/core/dependency-container/registrations", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/core/dependency-container/registrations", "default.asClass")
    @js.native
    def asClass: js.Any = js.native
    @scala.inline
    def asClass_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asClass")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/core/dependency-container/registrations", "default.asFunction")
    @js.native
    def asFunction: js.Any = js.native
    @scala.inline
    def asFunction_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asFunction")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def asValue(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("playable/dist/src/core/dependency-container/registrations", "PROPERTY_FOR_DEPENDENCIES")
  @js.native
  val PROPERTY_FOR_DEPENDENCIES: /* "dependencies" */ String = js.native
  
  @JSImport("playable/dist/src/core/dependency-container/registrations", "asClass")
  @js.native
  val asClass: js.Any = js.native
  
  @JSImport("playable/dist/src/core/dependency-container/registrations", "asFunction")
  @js.native
  val asFunction: js.Any = js.native
  
  @scala.inline
  def asValue(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def makeFluidInterface(obj: IOptions): Scoped = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFluidInterface")(obj.asInstanceOf[js.Any]).asInstanceOf[Scoped]
}
