package typings.ngFlow

import typings.flowjs.mod.IFlow
import typings.flowjs.mod.IFlowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object flow extends js.Object {
    @js.native
    trait IFlowFactory extends js.Object {
      def create(): IFlow = js.native
      def create(options: IFlowOptions): IFlow = js.native
    }
    
  }
  
}

