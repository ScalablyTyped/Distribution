package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typings.next.mod.GetServerSidePropsContext[Q], 
    js.Promise[typings.next.mod.GetServerSidePropsResult[P]]
  ]
  type GetStaticPaths[P /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function0[js.Promise[typings.next.anon.Fallback[P]]]
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typings.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typings.next.mod.GetStaticPropsContext[Q], 
    js.Promise[typings.next.mod.GetStaticPropsResult[P]]
  ]
  type InferGetServerSidePropsType[T] = js.Any
  type InferGetStaticPropsType[T] = js.Any
  type NextPage[P, IP] = typings.next.utilsMod.NextComponentType[typings.next.utilsMod.NextPageContext, IP, P]
}
