package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction
  extends knexLib.knexMod.Knex {
  def commit[QM](): js.Promise[QM] = js.native
  def commit[QM](value: js.Any): js.Promise[QM] = js.native
  def rollback[QM](): js.Promise[QM] = js.native
  def rollback[QM](error: stdLib.Error): js.Promise[QM] = js.native
  def savepoint(transactionScope: js.Function1[/* trx */ this.type, _]): js.Promise[_] = js.native
}

@js.native
trait transaction[T] extends js.Object {
  def apply[V](knex: knexLib.knexMod.Knex, callback: js.Function1[/* trx */ Transaction, js.Promise[V]]): js.Promise[V] = js.native
  def apply[MC /* <: ModelClass[_] */, V](
    modelClass: MC,
    callback: js.Function2[/* boundModelClass */ MC, /* trx */ js.UndefOr[Transaction], js.Promise[V]]
  ): js.Promise[V] = js.native
  def apply[MC1 /* <: ModelClass[_] */, MC2 /* <: ModelClass[_] */, V](
    modelClass1: MC1,
    modelClass2: MC2,
    callback: js.Function3[
      /* boundModel1Class */ MC1, 
      /* boundModel2Class */ MC2, 
      /* trx */ js.UndefOr[Transaction], 
      js.Promise[V]
    ]
  ): js.Promise[V] = js.native
  def apply[MC1 /* <: ModelClass[_] */, MC2 /* <: ModelClass[_] */, MC3 /* <: ModelClass[_] */, V](
    modelClass1: MC1,
    modelClass2: MC2,
    modelClass3: MC3,
    callback: js.Function4[
      /* boundModel1Class */ MC1, 
      /* boundModel2Class */ MC2, 
      /* boundModel3Class */ MC3, 
      /* trx */ js.UndefOr[Transaction], 
      js.Promise[V]
    ]
  ): js.Promise[V] = js.native
  def apply[MC1 /* <: ModelClass[_] */, MC2 /* <: ModelClass[_] */, MC3 /* <: ModelClass[_] */, MC4 /* <: ModelClass[_] */, V](
    modelClass1: MC1,
    modelClass2: MC2,
    modelClass3: MC3,
    modelClass4: MC4,
    callback: js.Function5[
      /* boundModel1Class */ MC1, 
      /* boundModel2Class */ MC2, 
      /* boundModel3Class */ MC3, 
      /* boundModel4Class */ MC4, 
      /* trx */ js.UndefOr[Transaction], 
      js.Promise[V]
    ]
  ): js.Promise[V] = js.native
  def apply[MC1 /* <: ModelClass[_] */, MC2 /* <: ModelClass[_] */, MC3 /* <: ModelClass[_] */, MC4 /* <: ModelClass[_] */, MC5 /* <: ModelClass[_] */, V](
    modelClass1: MC1,
    modelClass2: MC2,
    modelClass3: MC3,
    modelClass4: MC4,
    modelClass5: MC5,
    callback: js.Function6[
      /* boundModel1Class */ MC1, 
      /* boundModel2Class */ MC2, 
      /* boundModel3Class */ MC3, 
      /* boundModel4Class */ MC4, 
      /* boundModel5Class */ MC5, 
      /* trx */ js.UndefOr[Transaction], 
      js.Promise[V]
    ]
  ): js.Promise[V] = js.native
  def start(knexOrModel: knexLib.knexMod.Knex): js.Promise[Transaction] = js.native
  def start(knexOrModel: ModelClass[_]): js.Promise[Transaction] = js.native
}

