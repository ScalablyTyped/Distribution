package typings.novaEditorNode

import org.scalablytyped.runtime.StringDictionary
import typings.novaEditorNode.anon.Syntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AssistantArray[T] = js.Array[T] | js.Promise[js.Array[T]]

/// https://docs.nova.app/api-reference/assistants-registry/
type AssistantsRegistrySelector = String | (js.Array[String | Syntax]) | Syntax

/// https://docs.nova.app/api-reference/configuration/
type ConfigurationValue = String | Double | js.Array[String] | Boolean

/// https://docs.nova.app/api-reference/commands-registry/
/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Any]
  - js.Date
  - scala.Null
  - scala.Double
  - org.scalablytyped.runtime.StringDictionary[scala.Any]
  - js.RegExp
  - java.lang.String
  - typings.novaEditorNode.Color
  - typings.novaEditorNode.Range
*/
type Transferrable = _Transferrable | js.Array[Any] | StringDictionary[Any] | js.Date | Null | Double | js.RegExp | String

/// https://docs.nova.app/api-reference/credentials/
type User = Any
