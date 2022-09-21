package typings.pgTypes.mod

import typings.node.bufferMod.global.Buffer
import typings.pgTypes.mod.^
import typings.pgTypes.pgTypesStrings.binary
import typings.pgTypes.pgTypesStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def getTypeParser[T](oid: Double): TypeParser[String, T | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any]).asInstanceOf[TypeParser[String, T | String]]
inline def getTypeParser[T](oid: TypeId): TypeParser[String, T | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any]).asInstanceOf[TypeParser[String, T | String]]

inline def getTypeParser_binary[T](oid: Double, format: binary): TypeParser[Buffer, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[Buffer, T | String]]
inline def getTypeParser_binary[T](oid: TypeId, format: binary): TypeParser[Buffer, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[Buffer, T | String]]

inline def getTypeParser_text[T](oid: Double, format: text): TypeParser[String, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[String, T | String]]
inline def getTypeParser_text[T](oid: TypeId, format: text): TypeParser[String, T | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[TypeParser[String, T | String]]

inline def setTypeParser[T](oid: Double, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setTypeParser[T](oid: TypeId, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setTypeParser_binary[T](oid: Double, format: binary, parseFn: TypeParser[Buffer, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setTypeParser_binary[T](oid: TypeId, format: binary, parseFn: TypeParser[Buffer, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setTypeParser_text[T](oid: Double, format: text, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setTypeParser_text[T](oid: TypeId, format: text, parseFn: TypeParser[String, T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(oid.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]

type TypeId = builtins

type TypeParser[I /* <: String | Buffer */, T] = js.Function1[/* value */ I, T]

type TypesBuiltins = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof builtins */ Any
