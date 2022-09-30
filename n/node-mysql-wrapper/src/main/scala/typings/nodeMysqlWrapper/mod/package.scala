package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeMysqlWrapper.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EQUAL_TO_PROPERTY_SYMBOL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EQUAL_TO_PROPERTY_SYMBOL").asInstanceOf[String]
inline def EQUAL_TO_PROPERTY_SYMBOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUAL_TO_PROPERTY_SYMBOL")(x.asInstanceOf[js.Any])

inline def TABLE_RULES_PROPERTY: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TABLE_RULES_PROPERTY").asInstanceOf[String]
inline def TABLE_RULES_PROPERTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TABLE_RULES_PROPERTY")(x.asInstanceOf[js.Any])

inline def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: String, useTables: Any*): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(scala.List(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any]).`++`(useTables.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Database]
/** For meteor js only
  * Same as wrap but it's sync mode - autoconnect to the database without need to use database.ready(callback).
  */
inline def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mod.Connection, useTables: Any*): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(scala.List(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any]).`++`(useTables.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Database]

inline def observable[T](obj: T): T & ObservableObject = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(obj.asInstanceOf[js.Any]).asInstanceOf[T & ObservableObject]

inline def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: String, useTables: Any*): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(scala.List(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any]).`++`(useTables.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Database]
inline def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: typings.mysql.mod.Connection, useTables: Any*): Database = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(scala.List(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any]).`++`(useTables.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Database]

type Map[T] = StringDictionary[T]

type PropertyChangedCallback = js.Function1[/* args */ PropertyChangedArgs, Any]
