package typings.nouislider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nouislider.mod.^
import typings.nouislider.nouisliderBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def create(target: TargetElement, originalOptions: Options): API = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], originalOptions.asInstanceOf[js.Any])).asInstanceOf[API]

inline def cssClasses: CssClasses_ = ^.asInstanceOf[js.Dynamic].selectDynamic("cssClasses").asInstanceOf[CssClasses_]

type EventCallback = js.ThisFunction6[
/* this */ API, 
/* values */ js.Array[Double | String], 
/* handleNumber */ Double, 
/* unencoded */ js.Array[Double], 
/* tap */ Boolean, 
/* locations */ js.Array[Double], 
/* slider */ API, 
Unit]

type GetResult = Double | String | (js.Array[String | Double])

type HandleAttributes = StringDictionary[String]

type NextStepsForHandle = js.Tuple2[Double | `false` | Null, Double | `false` | Null]

type PipsFilter = js.Function2[/* value */ Double, /* type */ PipsType, PipsType]

type StartValues = String | Double | (js.Array[String | Double])

type SubRange = Double | WrappedSubRange

type WrappedSubRange = js.Array[Double] | (js.Tuple2[Double, Double])
