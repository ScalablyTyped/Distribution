package typings.maximMazurokGapiClientFitness

import typings.maximMazurokGapiClientFitness.gapi.client.fitness.UsersResource
import typings.maximMazurokGapiClientFitness.maximMazurokGapiClientFitnessStrings.fitness
import typings.maximMazurokGapiClientFitness.maximMazurokGapiClientFitnessStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object fitness {
        
        @JSGlobal("gapi.client.fitness.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Fitness API v1 */
      @scala.inline
      def load(name: fitness, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: fitness, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
