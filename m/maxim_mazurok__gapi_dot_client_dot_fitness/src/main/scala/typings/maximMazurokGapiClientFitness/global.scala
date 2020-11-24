package typings.maximMazurokGapiClientFitness

import typings.maximMazurokGapiClientFitness.gapi.client.fitness.UsersResource
import typings.maximMazurokGapiClientFitness.maximMazurokGapiClientFitnessStrings.fitness
import typings.maximMazurokGapiClientFitness.maximMazurokGapiClientFitnessStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Fitness API v1 */
      def load(name: fitness, version: v1): js.Thenable[Unit] = js.native
      def load(name: fitness, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object fitness extends js.Object {
        
        val users: UsersResource = js.native
      }
    }
  }
}
