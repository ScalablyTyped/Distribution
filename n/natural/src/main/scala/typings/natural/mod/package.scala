package typings.natural.mod

import typings.natural.anon.DamerauLevenshteinDistanc
import typings.natural.anon.DamerauLevenshteinDistancDeletioncost
import typings.natural.anon.DamerauLevenshteinDistancInsertioncost
import typings.natural.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DamerauLevenshteinDistance(source: String, target: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def DamerauLevenshteinDistance(source: String, target: String, options: DamerauLevenshteinDistanc): SubstringDistanceResult = (^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SubstringDistanceResult]
inline def DamerauLevenshteinDistance(source: String, target: String, options: DamerauLevenshteinDistancDeletioncost): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def DamerauLevenshteinDistance(source: String, target: String, options: DamerauLevenshteinDistancInsertioncost): Double | SubstringDistanceResult = (^.asInstanceOf[js.Dynamic].applyDynamic("DamerauLevenshteinDistance")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | SubstringDistanceResult]

type BayesClassifierCallback = js.Function2[/* err */ Any, /* classifier */ Any, Unit]

type LogisticRegressionClassifierCallback = js.Function2[/* err */ Any, /* classifier */ Any, Unit]

type TfIdfCallback = js.Function2[/* i */ Double, /* measure */ Double, Unit]

type WordNetGetCallback = js.Function1[/* results */ WordNetLookupResults, Unit]

type WordNetLookupCallback = js.Function1[/* results */ js.Array[WordNetLookupResults], Unit]
