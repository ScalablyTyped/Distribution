package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.metroFileMap.anon.FilePath
import typings.metroFileMap.anon.ReadonlyscmReadonlymergeb
import typings.metroFileMap.metroFileMapInts.`0`
import typings.metroFileMap.metroFileMapInts.`1`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CacheManagerFactory = js.Function1[/* buildParameters */ BuildParameters, CacheManager]

type Console = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof global.console */ Any

type DuplicatesIndex = Map[String, Map[String, DuplicatesSet]]

type DuplicatesSet = Map[String, /* type */ Double]

type EventsQueue = js.Array[FilePath]

type FileData = Map[Path, FileMetaData]

type FileMetaData = js.Tuple7[
/* id */ String, 
/* mtime */ Double, 
/* size */ Double, 
`0` | `1`, 
/* dependencies */ String, 
(/* sha1 */ String) | Null, 
`0` | `1` | String]

type Glob = String

type IgnoreMatcher = js.Function1[/* item */ String, Boolean]

type MockData = Map[String, Path]

type ModuleMapData = Map[String, ModuleMapItem]

type ModuleMapItem = StringDictionary[ModuleMetaData]

type ModuleMetaData = js.Tuple2[/* path */ String, /* type */ Double]

type Path = String

type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any

type WatchmanClockSpec = String | ReadonlyscmReadonlymergeb

type WatchmanClocks = Map[Path, WatchmanClockSpec]
