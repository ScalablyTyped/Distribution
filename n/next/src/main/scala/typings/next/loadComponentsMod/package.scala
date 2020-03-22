package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loadComponentsMod {
  type ReactLoadableManifest = org.scalablytyped.runtime.StringDictionary[js.Array[typings.next.loadComponentsMod.ManifestItem]]
  type UnstableGetServerProps = js.Function1[
    /* context */ typings.next.AnonQuery, 
    js.Promise[org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type UnstableGetStaticPaths = js.Function0[js.Promise[typings.next.AnonPaths]]
  type UnstableGetStaticProps = js.Function1[/* ctx */ typings.next.AnonPreview, js.Promise[typings.next.AnonProps]]
}
