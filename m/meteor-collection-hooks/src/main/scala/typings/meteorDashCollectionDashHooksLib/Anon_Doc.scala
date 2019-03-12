package typings
package meteorDashCollectionDashHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[T] extends js.Object {
  def find(
    hook: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def findOne(
    hook: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
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
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def upsert(
    hook: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_Doc {
  @scala.inline
  def apply[T](
    find: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ] => scala.Unit,
    findOne: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ] => scala.Unit,
    insert: js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit] => scala.Unit,
    remove: js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit] => scala.Unit,
    update: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[java.lang.String], 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ] => scala.Unit,
    upsert: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ] => scala.Unit
  ): Anon_Doc[T] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findOne = js.Any.fromFunction1(findOne), insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update), upsert = js.Any.fromFunction1(upsert))
  
    __obj.asInstanceOf[Anon_Doc[T]]
  }
}

