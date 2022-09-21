package typings.meteorTypings

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EJSON = EJSONable

type EJSONable = StringDictionary[
Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | js.typedarray.Uint8Array | EJSONableCustomType]

type Header = StringDictionary[String]

type JSONable = StringDictionary[Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String])]
