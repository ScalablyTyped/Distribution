package typings.meteorDashCollectionDashHooks

import typings.meteorDashCollectionDashHooks.meteorMongoMod.CollectionHooksNs.ModifierOptions
import typings.meteorDashTypings.MongoNs.Modifier
import typings.meteorDashTypings.MongoNs.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocFieldNames[T] extends js.Object {
  def find(
    hook: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]
  ): Unit
  def findOne(
    hook: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit]
  ): Unit
  def insert(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit
  def remove(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit
  def update(
    hook: js.Function5[
      /* userId */ String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ Modifier, 
      /* options */ ModifierOptions, 
      Unit
    ]
  ): Unit
  def upsert(
    hook: js.Function5[
      /* userId */ String, 
      /* doc */ T, 
      /* selector */ Selector, 
      /* modifier */ Modifier, 
      /* options */ ModifierOptions, 
      Unit
    ]
  ): Unit
}

object Anon_DocFieldNames {
  @scala.inline
  def apply[T](
    find: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit] => Unit,
    findOne: js.Function3[/* userId */ String, /* selector */ Selector, /* options */ ModifierOptions, Unit] => Unit,
    insert: js.Function2[/* userId */ String, /* doc */ T, Unit] => Unit,
    remove: js.Function2[/* userId */ String, /* doc */ T, Unit] => Unit,
    update: js.Function5[
      /* userId */ String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ Modifier, 
      /* options */ ModifierOptions, 
      Unit
    ] => Unit,
    upsert: js.Function5[
      /* userId */ String, 
      /* doc */ T, 
      /* selector */ Selector, 
      /* modifier */ Modifier, 
      /* options */ ModifierOptions, 
      Unit
    ] => Unit
  ): Anon_DocFieldNames[T] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findOne = js.Any.fromFunction1(findOne), insert = js.Any.fromFunction1(insert), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update), upsert = js.Any.fromFunction1(upsert))
  
    __obj.asInstanceOf[Anon_DocFieldNames[T]]
  }
}

