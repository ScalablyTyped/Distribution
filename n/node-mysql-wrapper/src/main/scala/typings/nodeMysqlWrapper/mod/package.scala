package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def EQUAL_TO_PROPERTY_SYMBOL: java.lang.String = typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EQUAL_TO_PROPERTY_SYMBOL").asInstanceOf[java.lang.String]
@scala.inline
def EQUAL_TO_PROPERTY_SYMBOL_=(x: java.lang.String): scala.Unit = typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].updateDynamic("EQUAL_TO_PROPERTY_SYMBOL")(x.asInstanceOf[js.Any])

@scala.inline
def TABLE_RULES_PROPERTY: java.lang.String = typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TABLE_RULES_PROPERTY").asInstanceOf[java.lang.String]
@scala.inline
def TABLE_RULES_PROPERTY_=(x: java.lang.String): scala.Unit = typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].updateDynamic("TABLE_RULES_PROPERTY")(x.asInstanceOf[js.Any])

@scala.inline
def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: java.lang.String, useTables: js.Any*): typings.nodeMysqlWrapper.mod.Database = (typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typings.nodeMysqlWrapper.mod.Database]
/** For meteor js only
  * Same as wrap but it's sync mode - autoconnect to the database without need to use database.ready(callback).
  */
@scala.inline
def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mod.Connection, useTables: js.Any*): typings.nodeMysqlWrapper.mod.Database = (typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typings.nodeMysqlWrapper.mod.Database]

@scala.inline
def observable[T](obj: T): T & typings.nodeMysqlWrapper.mod.ObservableObject = typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(obj.asInstanceOf[js.Any]).asInstanceOf[T & typings.nodeMysqlWrapper.mod.ObservableObject]

@scala.inline
def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: java.lang.String, useTables: js.Any*): typings.nodeMysqlWrapper.mod.Database = (typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typings.nodeMysqlWrapper.mod.Database]
@scala.inline
def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mod.Connection, useTables: js.Any*): typings.nodeMysqlWrapper.mod.Database = (typings.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typings.nodeMysqlWrapper.mod.Database]

type Map[T] = org.scalablytyped.runtime.StringDictionary[T]

type PropertyChangedCallback = js.Function1[/* args */ typings.nodeMysqlWrapper.mod.PropertyChangedArgs, js.Any]
