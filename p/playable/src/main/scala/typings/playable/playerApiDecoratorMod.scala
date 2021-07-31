package typings.playable

import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playerApiDecoratorMod {
  
  @JSImport("playable/dist/src/core/player-api-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function3[/* target */ js.Any, /* property */ String, /* descriptor */ PropertyDescriptor, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function3[/* target */ js.Any, /* property */ String, /* descriptor */ PropertyDescriptor, Unit]]
  @scala.inline
  def default(name: String): js.Function3[/* target */ js.Any, /* property */ String, /* descriptor */ PropertyDescriptor, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* property */ String, /* descriptor */ PropertyDescriptor, Unit]]
  
  @JSImport("playable/dist/src/core/player-api-decorator", "PLAYER_API_PROPERTY")
  @js.native
  val PLAYER_API_PROPERTY: /* "___playerAPI" */ String = js.native
}
