package typings
package meteorDashCollectionDashHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Find[T] extends js.Object {
  def find(
    hook: js.Function4[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      /* cursor */ meteorDashTypingsLib.MongoNs.Cursor[T], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def findOne(
    hook: js.Function4[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      /* doc */ T, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def insert(hook: js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit]): scala.Unit = js.native
  def remove(hook: js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit]): scala.Unit = js.native
  def update(
    hook: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def update(
    hook: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ],
    options: meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.HookOptionValue
  ): scala.Unit = js.native
  def upsert(
    hook: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

