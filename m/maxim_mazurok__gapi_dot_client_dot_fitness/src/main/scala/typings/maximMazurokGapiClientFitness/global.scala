package typings.maximMazurokGapiClientFitness

import typings.maximMazurokGapiClientFitness.gapi.client.fitness.UsersResource
import typings.maximMazurokGapiClientFitness.maximMazurokGapiClientFitnessStrings.fitness
import typings.maximMazurokGapiClientFitness.maximMazurokGapiClientFitnessStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object fitness {
        
        @JSGlobal("gapi.client.fitness.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Fitness API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: fitness, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: fitness, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
