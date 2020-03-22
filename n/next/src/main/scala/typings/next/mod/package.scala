package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = js.Function1[/* context */ typings.next.AnonPreview, js.Promise[typings.next.AnonPropsP[P]]]
  type GetStaticPaths = js.Function0[js.Promise[typings.next.AnonPaths]]
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = js.Function1[/* ctx */ typings.next.AnonParams, js.Promise[typings.next.AnonProps[P]]]
  type NextPage[P, IP] = typings.next.utilsMod.NextComponentType[typings.next.utilsMod.NextPageContext, IP, P]
}
