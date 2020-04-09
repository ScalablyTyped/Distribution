package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function1[/* context */ typings.next.AnonPreview[Q], js.Promise[typings.next.AnonPropsP[P]]]
  type GetStaticPaths[P /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function0[js.Promise[typings.next.AnonPaths[P]]]
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function1[/* ctx */ typings.next.AnonParams[Q], js.Promise[typings.next.AnonProps[P]]]
  type NextPage[P, IP] = typings.next.utilsMod.NextComponentType[typings.next.utilsMod.NextPageContext, IP, P]
}
