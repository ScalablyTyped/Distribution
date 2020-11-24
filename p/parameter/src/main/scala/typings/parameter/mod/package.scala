package typings.parameter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParameterCheckFunction[T /* <: java.lang.String */] = js.Function2[
    /* rule */ typings.parameter.mod.ParameterRuleCustom with typings.parameter.anon.Type[T], 
    /* value */ js.Any, 
    java.lang.String | js.Array[typings.parameter.mod.ValidateError] | scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.parameter.parameterStrings.int
    - typings.parameter.parameterStrings.number
    - typings.parameter.parameterStrings.string
    - typings.parameter.parameterStrings.bool
    - typings.parameter.parameterStrings.boolean
    - js.Function1[/ * value * / js.Any, js.Any]
  */
  type ParameterConvertType = typings.parameter.mod._ParameterConvertType | (js.Function1[/* value */ js.Any, js.Any])
  
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
    - js.Array[js.Any]
    - typings.std.RegExp
  */
  type ParameterRuleAbbr = typings.parameter.mod._ParameterRuleAbbr | js.Array[js.Any] | typings.std.RegExp
  
  type ParameterRuleBoolean = typings.parameter.mod.ParameterRuleBase
  
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
  type ParameterRuleItem = typings.parameter.mod._ParameterRuleItem | typings.parameter.mod.ParameterRuleBoolean
  
  type ParameterRules = typings.std.Record[
    java.lang.String, 
    js.UndefOr[
      typings.parameter.mod.ParameterRuleItem | typings.parameter.mod.ParameterRuleAbbr
    ]
  ]
  
  type ParameterTranslateFunction = js.ThisFunction2[
    /* this */ typings.parameter.mod.Parameter, 
    /* message */ java.lang.String, 
    /* repeated */ js.Any, 
    java.lang.String
  ]
}
