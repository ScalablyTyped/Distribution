package typings.parameter.mod

import typings.parameter.anon.Type
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def CONVERT_MAP: Record[String, js.UndefOr[ParameterConvertType]] = ^.asInstanceOf[js.Dynamic].selectDynamic("CONVERT_MAP").asInstanceOf[Record[String, js.UndefOr[ParameterConvertType]]]
inline def CONVERT_MAP_=(x: Record[String, js.UndefOr[ParameterConvertType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONVERT_MAP")(x.asInstanceOf[js.Any])

inline def TYPE_MAP: Record[String, js.UndefOr[ParameterCheckFunction[String]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_MAP").asInstanceOf[Record[String, js.UndefOr[ParameterCheckFunction[String]]]]

inline def addRule[T /* <: String */](`type`: T, check: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, `override`: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, `override`: Boolean, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: js.RegExp, `override`: Unit, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
/* static member */
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Add custom rules
  * @param type
  * @param check
  * @param override Override exist rules. Default: `true`
  * @param convertType Make parameter convert the input param to the specific type
  */
/* static member */
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], `override`: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](
  `type`: T,
  check: ParameterCheckFunction[T],
  `override`: Boolean,
  convertType: ParameterConvertType
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], `override`: Unit, convertType: ParameterConvertType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(`type`.asInstanceOf[js.Any], check.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any], convertType.asInstanceOf[js.Any])).asInstanceOf[Unit]

type ParameterCheckFunction[T /* <: String */] = js.Function2[
/* rule */ ParameterRuleCustom & Type[T], 
/* value */ Any, 
String | js.Array[ValidateError] | Unit]

/* Rewritten from type alias, can be one of: 
  - typings.parameter.parameterStrings.int
  - typings.parameter.parameterStrings.number
  - typings.parameter.parameterStrings.string
  - typings.parameter.parameterStrings.bool
  - typings.parameter.parameterStrings.boolean
  - js.Function1[/ * value * / scala.Any, scala.Any]
*/
type ParameterConvertType = _ParameterConvertType | (js.Function1[/* value */ Any, Any])

/* Rewritten from type alias, can be one of: 
  - typings.parameter.mod.ParameterRuleItem
  - typings.parameter.mod.ParameterRuleAbbr
  - scala.Unit
*/
type ParameterRule = js.UndefOr[_ParameterRule | ParameterRuleBoolean | js.Array[Any] | js.RegExp]

/* Rewritten from type alias, can be one of: 
  - typings.parameter.parameterStrings.int
  - typings.parameter.parameterStrings.intQuestionmark
  - typings.parameter.parameterStrings.integer
  - typings.parameter.parameterStrings.integerQuestionmark
  - typings.parameter.parameterStrings.number
  - typings.parameter.parameterStrings.numberQuestionmark
  - typings.parameter.parameterStrings.date
  - typings.parameter.parameterStrings.dateQuestionmark
  - typings.parameter.parameterStrings.dateTime
  - typings.parameter.parameterStrings.dateTimeQuestionmark
  - typings.parameter.parameterStrings.datetime_
  - typings.parameter.parameterStrings.datetimeQuestionmark
  - typings.parameter.parameterStrings.id
  - typings.parameter.parameterStrings.idQuestionmark
  - typings.parameter.parameterStrings.boolean
  - typings.parameter.parameterStrings.booleanQuestionmark
  - typings.parameter.parameterStrings.bool
  - typings.parameter.parameterStrings.boolQuestionmark
  - typings.parameter.parameterStrings.string
  - typings.parameter.parameterStrings.stringQuestionmark
  - typings.parameter.parameterStrings.email
  - typings.parameter.parameterStrings.emailQuestionmark
  - typings.parameter.parameterStrings.password
  - typings.parameter.parameterStrings.passwordQuestionmark
  - typings.parameter.parameterStrings.`object`
  - typings.parameter.parameterStrings.objectQuestionmark
  - typings.parameter.parameterStrings.array
  - typings.parameter.parameterStrings.arrayQuestionmark
  - js.Array[scala.Any]
  - js.RegExp
*/
type ParameterRuleAbbr = _ParameterRuleAbbr | js.Array[Any] | js.RegExp

type ParameterRuleBoolean = ParameterRuleBase

/* Rewritten from type alias, can be one of: 
  - typings.parameter.mod.ParameterRuleCustom
  - typings.parameter.mod.ParameterRuleNumber
  - typings.parameter.mod.ParameterRuleString
  - typings.parameter.mod.ParameterRuleID
  - typings.parameter.mod.ParameterRuleDateTime
  - typings.parameter.mod.ParameterRuleEmail
  - typings.parameter.mod.ParameterRuleUrl
  - typings.parameter.mod.ParameterRuleBoolean
  - typings.parameter.mod.ParameterRulePassword
  - typings.parameter.mod.ParameterRuleEnum
  - typings.parameter.mod.ParameterRuleObject
  - typings.parameter.mod.ParameterRuleArray
*/
type ParameterRuleItem = _ParameterRuleItem | ParameterRuleBoolean
