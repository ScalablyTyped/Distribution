package typings
package meteorDashCollectionDashHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FindHook[T] extends js.Object {
  def find(
    hook: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def findOne(
    hook: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def insert(hook: js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit]): scala.Unit
  def remove(hook: js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit]): scala.Unit
  def update(
    hook: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def upsert(
    hook: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.mongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
}

