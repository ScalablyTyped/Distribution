package typings.objection.mod

import org.scalablytyped.runtime.TopLevel
import typings.knex.mod.Knex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait transaction extends js.Object {
  def apply[ReturnValue](
    knex: Knex[_, js.Array[_]],
    callback: js.Function1[/* trx */ Transaction_, js.Promise[ReturnValue]]
  ): js.Promise[ReturnValue] = js.native
  def apply[MC1 /* <: AnyModelConstructor */, ReturnValue](
    modelClass1: MC1,
    callback: js.Function2[
      /* boundModelClass */ MC1, 
      /* trx */ js.UndefOr[Transaction_], 
      js.Promise[ReturnValue]
    ]
  ): js.Promise[ReturnValue] = js.native
  def apply[MC1 /* <: AnyModelConstructor */, MC2 /* <: AnyModelConstructor */, ReturnValue](
    modelClass1: MC1,
    modelClass2: MC2,
    callback: js.Function3[
      /* boundModelClass1 */ MC1, 
      /* boundModelClass2 */ MC2, 
      /* trx */ js.UndefOr[Transaction_], 
      js.Promise[ReturnValue]
    ]
  ): js.Promise[ReturnValue] = js.native
  def apply[MC1 /* <: AnyModelConstructor */, MC2 /* <: AnyModelConstructor */, MC3 /* <: AnyModelConstructor */, ReturnValue](
    modelClass1: MC1,
    modelClass2: MC2,
    modelClass3: MC3,
    callback: js.Function4[
      /* boundModelClass1 */ MC1, 
      /* boundModelClass2 */ MC2, 
      /* boundModelClass3 */ MC3, 
      /* trx */ js.UndefOr[Transaction_], 
      js.Promise[ReturnValue]
    ]
  ): js.Promise[ReturnValue] = js.native
  def apply[MC1 /* <: AnyModelConstructor */, MC2 /* <: AnyModelConstructor */, MC3 /* <: AnyModelConstructor */, MC4 /* <: AnyModelConstructor */, ReturnValue](
    modelClass1: MC1,
    modelClass2: MC2,
    modelClass3: MC3,
    modelClass4: MC4,
    callback: js.Function5[
      /* boundModelClass1 */ MC1, 
      /* boundModelClass2 */ MC2, 
      /* boundModelClass3 */ MC3, 
      /* boundModelClass4 */ MC4, 
      /* trx */ js.UndefOr[Transaction_], 
      js.Promise[ReturnValue]
    ]
  ): js.Promise[ReturnValue] = js.native
  def apply[MC1 /* <: AnyModelConstructor */, MC2 /* <: AnyModelConstructor */, MC3 /* <: AnyModelConstructor */, MC4 /* <: AnyModelConstructor */, MC5 /* <: AnyModelConstructor */, ReturnValue](
    modelClass1: MC1,
    modelClass2: MC2,
    modelClass3: MC3,
    modelClass4: MC4,
    modelClass5: MC5,
    callback: js.Function6[
      /* boundModelClass1 */ MC1, 
      /* boundModelClass2 */ MC2, 
      /* boundModelClass3 */ MC3, 
      /* boundModelClass4 */ MC4, 
      /* boundModelClass5 */ MC5, 
      /* trx */ js.UndefOr[Transaction_], 
      js.Promise[ReturnValue]
    ]
  ): js.Promise[ReturnValue] = js.native
  def start(knexOrModel: Knex[_, js.Array[_]]): js.Promise[Transaction_] = js.native
  def start(knexOrModel: AnyModelConstructor): js.Promise[Transaction_] = js.native
}

@JSImport("objection", "transaction")
@js.native
object transaction extends TopLevel[transaction]

