package typings.meteor.global

import typings.meteor.Configuration
import typings.meteor.Mongo.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServiceConfiguration {
  
  @JSGlobal("ServiceConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ServiceConfiguration.configurations")
  @js.native
  def configurations: Collection[Configuration, Configuration] = js.native
  inline def configurations_=(x: Collection[Configuration, Configuration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configurations")(x.asInstanceOf[js.Any])
}
