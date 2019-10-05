package typings.meteorDashCollectionDashHooks

import typings.meteorDashCollectionDashHooks.meteorMongoMod.CollectionHooks.HookOptionValue
import typings.meteorDashCollectionDashHooks.meteorMongoMod.CollectionHooks.ModifierOptions
import typings.meteorDashTypings.Mongo.Cursor
import typings.meteorDashTypings.Mongo.Modifier
import typings.meteorDashTypings.Mongo.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CursorDoc[T] extends js.Object {
  def find(
    hook: js.Function4[
      /* userId */ String, 
      /* selector */ Selector, 
      /* options */ ModifierOptions, 
      /* cursor */ Cursor[T], 
      Unit
    ]
  ): Unit = js.native
  def findOne(
    hook: js.Function4[
      /* userId */ String, 
      /* selector */ Selector, 
      /* options */ ModifierOptions, 
      /* doc */ T, 
      Unit
    ]
  ): Unit = js.native
  def insert(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit = js.native
  def remove(hook: js.Function2[/* userId */ String, /* doc */ T, Unit]): Unit = js.native
  def update(
    hook: js.Function5[
      /* userId */ String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ Modifier, 
      /* options */ ModifierOptions, 
      Unit
    ]
  ): Unit = js.native
  def update(
    hook: js.Function5[
      /* userId */ String, 
      /* doc */ T, 
      /* fieldNames */ js.Array[String], 
      /* modifier */ Modifier, 
      /* options */ ModifierOptions, 
      Unit
    ],
    options: HookOptionValue
  ): Unit = js.native
  def upsert(
    hook: js.Function5[
      /* userId */ String, 
      /* doc */ T, 
      /* selector */ Selector, 
      /* modifier */ Modifier, 
      /* options */ ModifierOptions, 
      Unit
    ]
  ): Unit = js.native
}

