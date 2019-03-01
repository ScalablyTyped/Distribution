package typings
package meteorDashCollectionDashHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocFieldNames[T] extends js.Object {
  def find(
    hook: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def findOne(
    hook: js.Function3[
      /* userId */ java.lang.String, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
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
      /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def upsert(
    hook: js.Function5[
      /* userId */ java.lang.String, 
      /* doc */ T, 
      /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
      /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
      /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_DocFieldNames {
  @scala.inline
  def apply[T](
    find: js.Function1[
      js.Function3[
        /* userId */ java.lang.String, 
        /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
        /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
        scala.Unit
      ], 
      scala.Unit
    ],
    findOne: js.Function1[
      js.Function3[
        /* userId */ java.lang.String, 
        /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
        /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
        scala.Unit
      ], 
      scala.Unit
    ],
    insert: js.Function1[js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit], scala.Unit],
    remove: js.Function1[js.Function2[/* userId */ java.lang.String, /* doc */ T, scala.Unit], scala.Unit],
    update: js.Function1[
      js.Function5[
        /* userId */ java.lang.String, 
        /* doc */ T, 
        /* fieldNames */ js.Array[java.lang.String], 
        /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
        /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
        scala.Unit
      ], 
      scala.Unit
    ],
    upsert: js.Function1[
      js.Function5[
        /* userId */ java.lang.String, 
        /* doc */ T, 
        /* selector */ meteorDashTypingsLib.MongoNs.Selector, 
        /* modifier */ meteorDashTypingsLib.MongoNs.Modifier, 
        /* options */ meteorDashCollectionDashHooksLib.meteorMongoMod.CollectionHooksNs.ModifierOptions, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_DocFieldNames[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("findOne")(findOne)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[Anon_DocFieldNames[T]]
  }
}

